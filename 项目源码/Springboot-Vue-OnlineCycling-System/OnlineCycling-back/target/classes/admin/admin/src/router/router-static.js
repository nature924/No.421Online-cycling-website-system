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

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import luxian from '@/views/modules/luxian/list'
    import luxianCollection from '@/views/modules/luxianCollection/list'
    import luxianLiuyan from '@/views/modules/luxianLiuyan/list'
    import news from '@/views/modules/news/list'
    import qijiriji from '@/views/modules/qijiriji/list'
    import qijirijiCollection from '@/views/modules/qijirijiCollection/list'
    import qijirijiLiuyan from '@/views/modules/qijirijiLiuyan/list'
    import xinshouzhishi from '@/views/modules/xinshouzhishi/list'
    import xinshouzhishiCollection from '@/views/modules/xinshouzhishiCollection/list'
    import xinshouzhishiLiuyan from '@/views/modules/xinshouzhishiLiuyan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryLuxian from '@/views/modules/dictionaryLuxian/list'
    import dictionaryLuxianCollection from '@/views/modules/dictionaryLuxianCollection/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryQijiriji from '@/views/modules/dictionaryQijiriji/list'
    import dictionaryQijirijiCollection from '@/views/modules/dictionaryQijirijiCollection/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXinshouzhishi from '@/views/modules/dictionaryXinshouzhishi/list'
    import dictionaryXinshouzhishiCollection from '@/views/modules/dictionaryXinshouzhishiCollection/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryLuxian',
        name: '路线类型',
        component: dictionaryLuxian
    }
    ,{
        path: '/dictionaryLuxianCollection',
        name: '收藏表类型',
        component: dictionaryLuxianCollection
    }
    ,{
        path: '/dictionaryNews',
        name: '新闻类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryQijiriji',
        name: '骑记类型',
        component: dictionaryQijiriji
    }
    ,{
        path: '/dictionaryQijirijiCollection',
        name: '收藏表类型',
        component: dictionaryQijirijiCollection
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXinshouzhishi',
        name: '知识类型',
        component: dictionaryXinshouzhishi
    }
    ,{
        path: '/dictionaryXinshouzhishiCollection',
        name: '收藏表类型',
        component: dictionaryXinshouzhishiCollection
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛信息',
        component: forum
      }
    ,{
        path: '/luxian',
        name: '路线攻略',
        component: luxian
      }
    ,{
        path: '/luxianCollection',
        name: '路线攻略收藏',
        component: luxianCollection
      }
    ,{
        path: '/luxianLiuyan',
        name: '路线攻略留言',
        component: luxianLiuyan
      }
    ,{
        path: '/news',
        name: '新闻赛事',
        component: news
      }
    ,{
        path: '/qijiriji',
        name: '骑记分享',
        component: qijiriji
      }
    ,{
        path: '/qijirijiCollection',
        name: '骑记分享收藏',
        component: qijirijiCollection
      }
    ,{
        path: '/qijirijiLiuyan',
        name: '骑记分享留言',
        component: qijirijiLiuyan
      }
    ,{
        path: '/xinshouzhishi',
        name: '新手知识',
        component: xinshouzhishi
      }
    ,{
        path: '/xinshouzhishiCollection',
        name: '新手知识收藏',
        component: xinshouzhishiCollection
      }
    ,{
        path: '/xinshouzhishiLiuyan',
        name: '新手知识留言',
        component: xinshouzhishiLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
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
