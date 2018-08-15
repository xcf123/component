

var vm=new Vue({
    el:'#page-wrapper',
    data:{
        menuList:{},
        router:null,
        dialogFormVisible:false,
        name:"",
        dialogTitle:"",
        type:0,
    },
    created:function () {
        this.getMenuList();
    },
    methods:{
        getMenuList:function () {
            var storage=window.localStorage;
            storage.clear();
            var _this = this;
            $.getJSON("menu/menuList",function (r) {
                _this.menuList=r.menuList;
                _this.router=new Router();
                _this.routerList(_this.router, _this.menuList);
                _this.router.start();
            })
        },
        routerList:function (router,menuList) {
            var _this = this;
            debugger
            for(var i in menuList){
                var menu=menuList[i];
                router.add('#' + menu.url, function (){
                    var url = window.location.hash;
                    _this.$refs.subFrame.src = url.replace('#', '');

                })
            }
        },
        addMenu:function (id) {
            var _this=this;
            debugger
            if(id!=0){
                _this.type=id;
                _this.dialogTitle="条目名称"
            }else{
                debugger
                _this.dialogTitle="分类名称"
            }
            _this.dialogFormVisible=true;
        },
        addDetail:function () {
            var _this=this;
            axios.post("menu/addDetail",{
                "name":_this.name,
                "type":_this.type,
            }).then(function (resp) {
                if(resp.data.code==0){
                    _this.$message({
                        message: '保存成功',
                        type: 'success'
                    });
                    setTimeout( function(){
                        _this.dialogFormVisible=false;
                        _this.getMenuList();
                        _this.name="";
                        _this.type="";
                    }, 1000 );
                }
            })
        },
    }


})