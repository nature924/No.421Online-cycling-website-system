const base = {
    get() {
        return {
            url : "http://localhost:8080/zaixianqixingwangzhan/",
            name: "zaixianqixingwangzhan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zaixianqixingwangzhan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线骑行网站"
        } 
    }
}
export default base
