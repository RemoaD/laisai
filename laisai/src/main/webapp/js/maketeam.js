//获取队伍节点
var oneteam = document.getElementsByClassName('oneteam');


for(var i = 0;i < oneteam.length;i++) {
	//点击查看弹出详细信息框
	var a_look = oneteam[i].getElementsByClassName('look')[0];
	a_look.onclick = function() {
		lookTeam();
	}
}

function lookTeam() {
	//创建遮罩层
	var wWidth = document.body.scrollWidth,
		wHeight = document.body.scrollHeight,
		mask1 = document.createElement('div');
	mask1.id = 'mask1';
	mask1.style.width = wWidth + 'px';
	mask1.style.height = wHeight + 'px';
	document.body.appendChild(mask1);
	mask1.onclick = function() {
		document.body.removeChild(mask1);
		document.body.removeChild(teamBox);
	}

	//创建队伍弹出框
	var teamBox = document.createElement('div');
	teamBox.className = 'team-members';
	teamBox.innerHTML = '<div class="close-btn clearfix" id="closeBtn1"><a href="#"><img src="img/close1.png" alt="关闭" /></a></div><div class="slider"><div class="slider-box clearfix"><div class="slider-i slider-i-active"><img src="img/member1.jpg" alt="队员" /><span class="mem-name">史蒂芬</span><ul><li><i class="fa fa-user-circle-o fa-lg" aria-hidden="true"></i>&nbsp;<span>男</span></li><li><i class="fa fa-heart fa-lg" aria-hidden="true"></i>&nbsp;<span>编程</span></li><li><i class="fa fa-map-marker fa-lg" aria-hidden="true"></i>&nbsp;<span>计算机学院</span></li></ul><div class="about-myself"><p>5.1我还有我的室友，还有女神，放弃了这三天假期，参加了这一次五一校赛。校赛整体上还是很顺利的，我们在一起讨论题目，第一天上午确定了选做B题，下午查找了一些知网上的文献确定了第一问的模型，第二天搞定了第一问和第二问，第三天晚上9点完成了第三问和论文。在这个过程中，三人都贡献了自己的力量，我主要负责建模还有编程，室友还有女神主要负责写作，不得不说女神的Word用的真心不错，而且学习能力也很强，一教就会，非常聪明。室友也很不错，自己搞定了第三问，而且在模型上也提出了很多的意见。尽管中间有段时间出现了问题，但是我们能够从容面对，然后kill它。</p></div><input type="button" value="邀请" name="" /></div><div class="slider-i"><img src="img/member2.jpg" alt="队员" /><span class="mem-name">格雷斯</span><ul><li><i class="fa fa-user-circle-o fa-lg" aria-hidden="true"></i>&nbsp;<span>女</span></li><li><i class="fa fa-heart fa-lg" aria-hidden="true"></i>&nbsp;<span>写作</span></li><li><i class="fa fa-map-marker fa-lg" aria-hidden="true"></i>&nbsp;<span>外国语学院</span></li></ul><div class="about-myself"><p>做人如果没有梦想，和咸鱼又有什么却别呢。我在四岁时开始上幼儿园，期间学习了英语德语法语blablabla。写作表达能力还算不错。在大一时便开始组队参加数学建模大赛。获得校赛一等奖，美赛。。。。。</p></div><input type="button" value="邀请" name="" /></div></div></div><div class="slider-btn"><ul><li class="slider-btn-active" index="0"></li><li index="1"></li></ul></div>'
	teamBox.style.top = (wHeight/32-35/2) + 'rem';
	teamBox.style.left = (wWidth/32-50/2) + 'rem';
	document.body.appendChild(teamBox);

	//轮播图页面切换
	function changeSlider() {
		var slider_i = document.getElementsByClassName('slider-i'),
			slider_btn = document.getElementsByClassName('slider-btn')[0].getElementsByTagName('li');
		for(var j = 0;j < slider_btn.length;j++ ) {
			slider_btn[j].onclick = function() {
				for(var k = 0;k < slider_btn.length;k++) {
					slider_i[k].className = slider_i[k].className.replace('slider-i-active','');
					slider_btn[k].className = slider_btn[k].className.replace('slider-btn-active','');
				}
				var cur_index = this.getAttribute('index');
				slider_btn[cur_index].className += ' slider-btn-active';
				slider_i[cur_index].className += ' slider-i-active';
			}
		}
	}
	changeSlider();

	//点击×关闭弹出层
	var closeBtn = document.getElementById('closeBtn1').getElementsByTagName('a')[0];
	closeBtn.onclick = function() {
		document.body.removeChild(mask1);
		document.body.removeChild(teamBox);
	}

}

