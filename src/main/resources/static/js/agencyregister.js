function cherkBlur(){
    // alert("hagli");

    // 用户名
    var customerName = document.getElementById("customerName");
    console.log(customerName.value);
    console.log(customerName.value.length);
    if(customerName.value.length < 3  || customerName.value.length > 8){
        console.log("error");
        document.getElementById("customerNameError").innerHTML = "<em style='color: red;'>用户名由3-8位数组成</em>";
        customerName.focus();
        return false;
    }else{
        console.log("ok");
        document.getElementById("customerNameError").innerHTML = "<em style='color: blue;'>OK</em>";
    }


    // 密码js
    var regs = /^[a-zA-Z0-9]+$/;
    var customerPassword = document.getElementById("customerPassword");
    if(customerPassword.value.length < 6
        || customerPassword.value.length > 16
        || !regs.test(customerPassword.value)){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("customerPasswordError").innerHTML = "<em style='color: red;'>密码由6-16位字符组成</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("customerPasswordError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 确认密码
    var customerRepassword = document.getElementById("customerRepassword");
    if(customerRepassword.value !=customerPassword.value){
        document.getElementById("customerRepasswordError").innerHTML = "<em style='color: red;'>与上面密码不符</em>";
        customerRepassword.focus();
        return false;
    }else {
        document.getElementById("customerRepasswordError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 姓名js
    var personName = document.getElementById("personName");
    if(personName.value.length < 3 || personName.value.length > 16){
        //alert("用户");
        document.getElementById("personNameError").innerHTML = "<em style='color: red;'>姓名由3-16位组成</em>";
        personName.focus();
        return false;
    }else{
        /*var username = $.trim($("#user").val());
        $.ajax({
            type:"POST",   //http请求方式
            url:"<spring:url value="/login/username/isExist" />", //发送给服务器的url
            data:"username="+username, //发送给服务器的参数
            dataType:"json",  //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
            complete : function(msg) {
                var result = eval("(" + msg.responseText + ")");
                if(result.success) {
                    $("#showResult").html(result.message);
                } else {
                    $("#showResult").html(result.message);
                }
            }
        });*/
        document.getElementById("personNameError").innerHTML = "<em style='color: blue;'>OK</em>";
    }


    // 性别
    var customerSexNum = document.getElementsByName("customerSex");
    var flag = 0;  // 标记
    for(var i = 0; i < customerSexNum.length; i++) {
        if(customerSexNum[i].checked == true) {
            flag = 1;
        }
    }
    if(flag == 0){
        document.getElementById("customerSexError").innerHTML = "<em style='color: red;'>必选项</em>";
        return false;
    }else {
        document.getElementById("customerSexError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 出生日期
    var customerBirthday = document.getElementById("customerBirthday");
    var date = customerBirthday.val();
    console.log(date);
    // alert(sage);
    if(date == null){
        // alert("hello");
        document.getElementById("customerBirthdayError").innerHTML = "<em style='color: red;'>出生日期不能为空</em>";
        return false;
    }else {
        document.getElementById("customerBirthdayError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 邮箱
    var customerMail = document.getElementById("customerMail");
    if(customerMail.value.length <= 0){
        document.getElementById("customerMailError").innerHTML = "<em style='color: red;'>必填项</em>";
        return false;
    }else {
        document.getElementById("customerMailError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 邮箱
    var customerTelephone = document.getElementById("customerTelephone");
    if(customerMail.value.length == 11){
        document.getElementById("customerTelephoneError").innerHTML = "<em style='color: blue;'>OK</em>";

    }else {
        document.getElementById("customerTelephoneError").innerHTML = "<em style='color: red;'>手机号必须是11位</em>";
        return false;
    }
    // 地址
    var customerAddress = document.getElementById("customerAddress");
    if(customerAddress.value <0 || customerAddress.valueO > 128) {
        document.getElementById("customerAddressError").innerHTML = "<em style='color: red;'>地址不为空，长度不超过128个字</em>";
        date.focus();
        return false;
    }else {
        document.getElementById("birthdayError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

};

// function cherkBlur(){
//     //alert("hagli");
//     // 用户js
//     var uValue = document.getElementById("user");
//     if(uValue.value.length < 6 || uValue.value.length > 18){
//         //alert("用户");
//         document.getElementById("userError").innerHTML = "<em style='color: red;'>用户名由6-18位组成</em>";
//         uValue.focus();
//         return false;
//     }else{
//         var username = $.trim($("#user").val());
//         $.ajax({
//             type:"POST",   //http请求方式
//             url:"<spring:url value="/login/username/isExist" />", //发送给服务器的url
//             data:"username="+username, //发送给服务器的参数
//             dataType:"json",  //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
//             complete : function(msg) {
//                 var result = eval("(" + msg.responseText + ")");
//                 if(result.success) {
//                     $("#showResult").html(result.message);
//                 } else {
//                     $("#showResult").html(result.message);
//                 }
//             }
//         });
//     }
//     // 密码js
//     var regs = /^[a-zA-Z0-9]+$/;
//     var pValue = document.getElementById("password");
//     if(pValue.value.length < 6
//         || uValue.value.length > 18
//         || !regs.test(pValue.value)){
//         //alert(regs.test(pValue.value)+"");
//         document.getElementById("passwordError").innerHTML = "<em style='color: red;'>密码由6-18位字符组成</em>";
//         pValue.focus();
//         return false;
//     }else{
//         document.getElementById("passwordError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 确认密码
//     var rpValue = document.getElementById("repassword");
//     if(rpValue.value != pValue.value){
//         document.getElementById("repasswordError").innerHTML = "<em style='color: red;'>与上面密码不符</em>";
//         rpValue.focus();
//         return false;
//     }else {
//         document.getElementById("repasswordError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 用户类型
//     var selUser = document.getElementById("choose");
//     //alert(selUser.selectedIndex+"");
//     if(selUser.selectedIndex == 0) {
//         document.getElementById("chooseError").innerHTML = "<em style='color: red;'>没有选择用户类型</em>";
//         selUser.focus();
//         return false;
//     }else {
//         document.getElementById("chooseError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 性别
//     var sexNum = document.getElementsByName("sex");
//     var flag = 0;  // 标记
//     for(var i = 0; i < sexNum.length; i++) {
//         if(sexNum[i].checked == true) {
//             flag = 1;
//         }
//     }
//     if(flag == 0){
//         document.getElementById("sexError").innerHTML = "<em style='color: red;'>必选项</em>";
//         return false;
//     }else {
//         document.getElementById("sexError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //电子邮箱
//     var eValue = document.getElementById("email");
//     var pattern = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
//     if(eValue.length == 0 || !pattern.test(eValue.value)) {
//         //alert("sdfsd");
//         document.getElementById("emailError").innerHTML = "<em style='color: red;'>邮箱格式错误</em>";
//         eValue.focus();
//         return false;
//     }else {
//         document.getElementById("emailError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //出生日期
//     var date = document.getElementById("birthday");
//     if(date.value == "") {
//         document.getElementById("birthdayError").innerHTML = "<em style='color: red;'>必填项</em>";
//         date.focus();
//         return false;
//     }else {
//         document.getElementById("birthdayError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //自我介绍
//     var introduce = document.getElementById("introduce");
//     if(introduce.value == "") {
//         document.getElementById("introduceError").innerHTML = "<em style='color: red;'>必填项</em>";
//         introduce.focus();
//         return false;
//     }else if(introduce.value.length < 100){
//         document.getElementById("introduceError").innerHTML = "<em style='color: red;'>内容不少于100字</em>";
//         introduce.focus();
//         return false;
//     }else {
//         document.getElementById("introduceError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
// };