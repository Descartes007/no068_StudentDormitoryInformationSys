import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import wupinleibie from '@/views/modules/wupinleibie/list'
    import news from '@/views/modules/news/list'
    import weixiurenyuan from '@/views/modules/weixiurenyuan/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import tongzhuangshui from '@/views/modules/tongzhuangshui/list'
    import shiwuxinxi from '@/views/modules/shiwuxinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import susheanpai from '@/views/modules/susheanpai/list'
    import baoxiuchuli from '@/views/modules/baoxiuchuli/list'
    import storeup from '@/views/modules/storeup/list'
    import shangjia from '@/views/modules/shangjia/list'
    import wenmingsushe from '@/views/modules/wenmingsushe/list'
    import tongzhuangshuipinpai from '@/views/modules/tongzhuangshuipinpai/list'
    import zhaolingxinxi from '@/views/modules/zhaolingxinxi/list'
    import discusstongzhuangshui from '@/views/modules/discusstongzhuangshui/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import discussshiwuxinxi from '@/views/modules/discussshiwuxinxi/list'
    import tongzhuangshuiyuding from '@/views/modules/tongzhuangshuiyuding/list'
    import sushexinxi from '@/views/modules/sushexinxi/list'
    import weishengjiancha from '@/views/modules/weishengjiancha/list'
    import banji from '@/views/modules/banji/list'
    import jiaqiliusu from '@/views/modules/jiaqiliusu/list'
    import config from '@/views/modules/config/list'
    import discusszhaolingxinxi from '@/views/modules/discusszhaolingxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/wupinleibie',
        name: '物品类别',
        component: wupinleibie
      }
      ,{
	path: '/news',
        name: '宿舍公告',
        component: news
      }
      ,{
	path: '/weixiurenyuan',
        name: '维修人员',
        component: weixiurenyuan
      }
      ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
      ,{
	path: '/tongzhuangshui',
        name: '桶装水',
        component: tongzhuangshui
      }
      ,{
	path: '/shiwuxinxi',
        name: '失物信息',
        component: shiwuxinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/susheanpai',
        name: '宿舍安排',
        component: susheanpai
      }
      ,{
	path: '/baoxiuchuli',
        name: '报修处理',
        component: baoxiuchuli
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
      ,{
	path: '/wenmingsushe',
        name: '文明宿舍',
        component: wenmingsushe
      }
      ,{
	path: '/tongzhuangshuipinpai',
        name: '桶装水品牌',
        component: tongzhuangshuipinpai
      }
      ,{
	path: '/zhaolingxinxi',
        name: '招领信息',
        component: zhaolingxinxi
      }
      ,{
	path: '/discusstongzhuangshui',
        name: '桶装水评论',
        component: discusstongzhuangshui
      }
      ,{
	path: '/jiaofeixinxi',
        name: '缴费信息',
        component: jiaofeixinxi
      }
      ,{
	path: '/discussshiwuxinxi',
        name: '失物信息评论',
        component: discussshiwuxinxi
      }
      ,{
	path: '/tongzhuangshuiyuding',
        name: '桶装水预订',
        component: tongzhuangshuiyuding
      }
      ,{
	path: '/sushexinxi',
        name: '宿舍信息',
        component: sushexinxi
      }
      ,{
	path: '/weishengjiancha',
        name: '卫生检查',
        component: weishengjiancha
      }
      ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
      ,{
	path: '/jiaqiliusu',
        name: '假期留宿',
        component: jiaqiliusu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discusszhaolingxinxi',
        name: '招领信息评论',
        component: discusszhaolingxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
