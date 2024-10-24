
var projectName = '学生宿舍信息的系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '桶装水',
	url: './pages/tongzhuangshui/list.html'
}, 
{
	name: '失物信息',
	url: './pages/shiwuxinxi/list.html'
}, 
{
	name: '招领信息',
	url: './pages/zhaolingxinxi/list.html'
}, 

{
	name: '宿舍公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot68ozj/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级","menuJump":"列表","tableName":"banji"}],"menu":"班级管理"},{"child":[{"buttons":["新增","查看","修改","删除","卫生","缴费"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"维修人员","menuJump":"列表","tableName":"weixiurenyuan"}],"menu":"维修人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"buttons":["新增","查看","修改","删除","安排"],"menu":"宿舍信息","menuJump":"列表","tableName":"sushexinxi"}],"menu":"宿舍信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"宿舍安排","menuJump":"列表","tableName":"susheanpai"}],"menu":"宿舍安排管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"报修处理","menuJump":"列表","tableName":"baoxiuchuli"}],"menu":"报修处理管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"假期留宿","menuJump":"列表","tableName":"jiaqiliusu"}],"menu":"假期留宿管理"},{"child":[{"buttons":["查看","修改","删除","报表","文明宿舍"],"menu":"卫生检查","menuJump":"列表","tableName":"weishengjiancha"}],"menu":"卫生检查管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"文明宿舍","menuJump":"列表","tableName":"wenmingsushe"}],"menu":"文明宿舍管理"},{"child":[{"buttons":["查看","修改","删除","导出"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"桶装水品牌","menuJump":"列表","tableName":"tongzhuangshuipinpai"}],"menu":"桶装水品牌管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"桶装水","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"桶装水预订","menuJump":"列表","tableName":"tongzhuangshuiyuding"}],"menu":"桶装水预订管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"物品类别","menuJump":"列表","tableName":"wupinleibie"}],"menu":"物品类别管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"失物信息","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息管理"},{"child":[{"buttons":["删除","修改","查看"],"menu":"招领信息","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"宿舍公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预订"],"menu":"桶装水列表","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水模块"},{"child":[{"buttons":["查看"],"menu":"失物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息模块"},{"child":[{"buttons":["查看"],"menu":"招领信息列表","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"宿舍安排","menuJump":"列表","tableName":"susheanpai"}],"menu":"宿舍安排管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["查看"],"menu":"报修处理","menuJump":"列表","tableName":"baoxiuchuli"}],"menu":"报修处理管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"假期留宿","menuJump":"列表","tableName":"jiaqiliusu"}],"menu":"假期留宿管理"},{"child":[{"buttons":["查看"],"menu":"卫生检查","menuJump":"列表","tableName":"weishengjiancha"}],"menu":"卫生检查管理"},{"child":[{"buttons":["查看"],"menu":"文明宿舍","menuJump":"列表","tableName":"wenmingsushe"}],"menu":"文明宿舍管理"},{"child":[{"buttons":["查看","支付"],"menu":"缴费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"缴费信息管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"桶装水预订","menuJump":"列表","tableName":"tongzhuangshuiyuding"}],"menu":"桶装水预订管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"失物信息","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"招领信息","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","预订"],"menu":"桶装水列表","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水模块"},{"child":[{"buttons":["查看"],"menu":"失物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息模块"},{"child":[{"buttons":["查看"],"menu":"招领信息列表","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","审核","处理"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"报修处理","menuJump":"列表","tableName":"baoxiuchuli"}],"menu":"报修处理管理"}],"frontMenu":[{"child":[{"buttons":["查看","预订"],"menu":"桶装水列表","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水模块"},{"child":[{"buttons":["查看"],"menu":"失物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息模块"},{"child":[{"buttons":["查看"],"menu":"招领信息列表","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"维修人员","tableName":"weixiurenyuan"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"桶装水","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水管理"},{"child":[{"buttons":["查看","审核"],"menu":"桶装水预订","menuJump":"列表","tableName":"tongzhuangshuiyuding"}],"menu":"桶装水预订管理"}],"frontMenu":[{"child":[{"buttons":["查看","预订"],"menu":"桶装水列表","menuJump":"列表","tableName":"tongzhuangshui"}],"menu":"桶装水模块"},{"child":[{"buttons":["查看"],"menu":"失物信息列表","menuJump":"列表","tableName":"shiwuxinxi"}],"menu":"失物信息模块"},{"child":[{"buttons":["查看"],"menu":"招领信息列表","menuJump":"列表","tableName":"zhaolingxinxi"}],"menu":"招领信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"商家","tableName":"shangjia"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
