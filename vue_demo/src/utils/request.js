import axios from 'axios'
import {
  getToken
} from '@/utils/auth'
// 创建axios实例
const service = axios.create({
  baseURL: 'http://localhost:8443/api', //url = base url + request url
  timeout: 5000 //请求时间
})
// 请求拦截器
service.interceptors.request.use(
  config => {
    let token = getToken();
    if (token) {
      config.headers['Authorization'] = `Bearer ${token}` //设置代理凭证
    }
    return config
  },
  error => {
    // 做一些请求错误处理（弹框或输出错误）
    console.log(error); //输出错误
    return Promise.reject(error)
  }
)
// 服务器响应拦截
service.interceptors.response.use(
  response => {
    const res = response.data;
    // 如果接口状态不是200
    if (res.code !== 200) {
      alert(res.message) //错误处理
    }
    return res;
  },
  error => {
    // 做些错误处理
    return Promise.reject(error)
  }
)

export default service
