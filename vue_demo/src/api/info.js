import request from '@/utils/request'

// 信息请求接口
export function getMessage(url, method, params) {
  return request({
    url: url,//接口url 例如：'/uer/info'
    method: method,
    params
  })
}


export function postMessage(url, method, data) {
  return request({
    url: url,//接口url 例如：'/uer/info'
    method: method,
    data
  })
}

export function deleteMessage(url, method, data) {
  return request({
    url: url + data,//接口url 例如：'/uer/info'
    method: 'delete'
  })
}
