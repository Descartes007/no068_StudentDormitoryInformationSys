const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot68ozj/",
            name: "springboot68ozj",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot68ozj/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生宿舍信息的系统"
        } 
    }
}
export default base
