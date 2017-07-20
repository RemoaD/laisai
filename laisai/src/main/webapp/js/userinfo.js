//真实姓名
$('#userName').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入真实姓名');
})
$('#userName').blur(function() {
	var uN = /^[\u4E00-\u9FA5]{2,5}(?:·[\u4E00-\u9FA5]{2,5})*$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!uN.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的真实姓名');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//姓名拼音
$('#userpingyin').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入姓名的拼音');
})
$('#userpingyin').blur(function() {
	var py = /^[a-z|A-Z| ]+$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!py.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的拼音');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})
/*
//学校
$('#schoolName').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入学校名称');
})
$('#userpingyin').blur(function() {
	var xx = /^[\u4E00-\u9FA5]+$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!xx.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的学校名称');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})
*/
//学院
$('#collegeName').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入学院名称');
})
$('#collegeName').blur(function() {
	var xy = /^[\u4E00-\u9FA5]+$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!xy.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的学院名称');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//专业
$('#zhuanyeName').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入专业名称');
})
$('#zhuanyeName').blur(function() {
	var xy = /^[\u4E00-\u9FA5]+$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!xy.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的专业名称');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//学号
$('#studentNumber').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入学号');
})
$('#studentNumber').blur(function() {
	var xh = /^[0-9]+$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!xh.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的学号');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//手机
$('#phoneNumber').focus(function() {
	$(this).parents('.form-group').find('.error').html('请输入手机号码');
})
$('#phoneNumber').blur(function() {
	var sj = /^1[3|4|5|7|8][0-9]{9}$/;
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else if(!sj.test($(this).val())) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">请输入正确的手机号码');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//职能意向
/*
(function() {
	if($('#jianmo').attr('checked')||$('#biancheng').attr('checked')||$('#xiezuo').attr('checked')) {
		$('#jianmo').parent('.form-group').find('.error').html('<img src="../img/false.png" class="false">请选择至少一项意向职能');
	}else {
		$(this).parent('.form-group').find('.error').html('<img src="img/true.png" class="true">输入正确');
	}
})*/

//个人简介
$('#userIntroduce').focus(function() {
	$(this).parents('.form-group').find('.error').html('输入不能为空');
})
$('#userIntroduce').blur(function() {
	if($(this).val()==0) {
		$(this).parents('.form-group').find('.error').html('<img src="../img/false.png" class="false">输入不能为空');
	}else {
		$(this).parents('.form-group').find('.error').html('<img src="../img/true.png" class="true">输入正确');
	}
})

//检测
$('#subBtn').click(function() {
	if($(this).parents().find("#userName").val()==""||$(this).parents().find("#userpingyin").val()==""||$(this).parents().find("#collegeName").val()==""||$(this).parents().find("#zhuanyeName").val()==""||$(this).parents().find("#studentNumber").val()==""||$(this).parents().find("#phoneNumber").val()==""||$(this).parents().find("#userIntroduce").val()==""){
		alert("请正确填写");
		return false;
	}
	else if($(this).parents().find("img").hasClass("false")){
		alert("请正确填写");
		return false;
	}
})