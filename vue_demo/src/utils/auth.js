import Cookie from 'js-cookie'
const TokenKey = "project-Key-name"

// 获取token值
export function getToken() {
    return Cookie.get(TokenKey)
}
// 在登录界面，调用此方法存储token值
export function setToken(token) {
    return Cookie.set(TokenKey, token)
}