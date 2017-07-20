window.onload = function() {
	/*whiteBoxLocal();*/
	addSliders();
	changeSliders(1);
	sliderBtn();
	mouseHover();
	dissolveTeam();
}

//获取数据
var data = [
	{img:1},
	{img:2},
	{img:3}
];

//修改轮播图及按钮的HTML
function addSliders() {
	var slider_main = document.getElementsByClassName('slider-main')[0],
		slider_ctrl_ul = document.getElementsByClassName('slider-ctrl-ul')[0],
		//去除多余空格
		slider_i = slider_main.innerHTML.replace(/^\s*/,'').replace(/\s*$/,''),
		ctrl_i = slider_ctrl_ul.innerHTML.replace(/^\s*/,'').replace(/\s*$/,''),
		//定义最终存储html的变量
		out_slider = [],
		out_ctrl = [];
	//构建最终输出的html
	for(var i in data) {
		var html_slider = slider_i.replace(/{{index}}/g,data[i].img)
									.replace(/{{css}}/,['','slider-i-right'][i%2+1]),
			html_ctrl = ctrl_i.replace(/{{index}}/g,data[i].img);
		out_slider.push(html_slider);
		out_ctrl.push(html_ctrl);
	}
	//将最终的html代码写回DOM中
	slider_main.innerHTML = out_slider.join('');
	slider_ctrl_ul.innerHTML = out_ctrl.join('');
	//优化背景
	slider_main.innerHTML += slider_i.replace(/{{index}}/g,'{{index}}');
	document.getElementById('slider_{{index}}').id = 'slider_bg';
}

//轮播图切换
function changeSliders(n) {
	var cur_slider = document.getElementById('slider_'+n),
		cur_ctrl = document.getElementById('ctrl_'+n),
		//获取所有轮播图以及按钮，清楚active样式
		all_slider = document.getElementsByClassName('slider-i'),
		all_ctrl = document.getElementsByClassName('slider-ctrl');
	for(var j = 0;j<all_ctrl.length;j++) {
		all_slider[j].className = all_slider[j].className.replace(' slider-i-active','');
		all_ctrl[j].className = all_ctrl[j].className.replace(' slider-ctrl-active','');
	}
	//当前轮播图和按钮添加active样式
	cur_slider.className += ' slider-i-active';
	cur_ctrl.className += ' slider-ctrl-active';
	//复制当前轮播图到背景
	/*setTimeout(function() {*/
		document.getElementById('slider_bg').innerHTML = cur_slider.innerHTML;
	/*},100);*/
}

function prevSlider() {
	var cur_slider = document.getElementsByClassName('slider-i-active')[0],
		cur_index = parseInt(cur_slider.getAttribute('index'));
	if(cur_index <= 1) {
		cur_index = 3;
	}else {
		cur_index--;
	}
	changeSliders(cur_index);
}

function nextSlider() {
	var cur_ctrl = document.getElementsByClassName('slider-i-active')[0],
		cur_index = parseInt(cur_ctrl.getAttribute('index'));
	if(cur_index >= 3) {
		cur_index = 1;
	}else {
		cur_index++;
	}
	changeSliders(cur_index);
}

//计时器自动播放
var timer = null;
timer = setInterval(function() {
	nextSlider();
},3000);

//点击按钮切换轮播图
function sliderBtn() {
	var all_ctrl = document.getElementsByClassName('slider-ctrl');
	for(var i = 0;i < all_ctrl.length;i++) {
		var j = i;
		all_ctrl[i].onclick = function() {
			changeSliders(j+1);
		}
	}
}

//鼠标悬浮到外div显示prev next并停止计时器
function mouseHover() {
	var slider_box = document.getElementsByClassName('slider-box')[0],
		prev_slider = document.getElementById('prevSlider'),
		next_slider = document.getElementById('nextSlider');
	slider_box.onmouseover = function() {
		clearInterval(timer);
		prev_slider.style.display = 'block';
		next_slider.style.display = 'block';
	}
	slider_box.onmouseleave = function() {
		timer = setInterval(function() {
			nextSlider();
		},3000);
		prev_slider.style.display = 'none';
		next_slider.style.display = 'none';
	}
}

function dissolveTeam() {
	var dissolveBtn = document.getElementById('jiesanBtn');
	dissolveBtn.onclick = function() {
		var result = window.confirm('确定解散队伍吗？');
		if(result==true) {
			//window.location.href='login.html';
		}else {
			return false;
		}
	}
}
