function addLoadEvent(func) {
	var oldonload = window.onload;
	if(typeof oldonload != 'function') {
		window.onload = func;
	}else {
		window.onload = function() {
			oldonload();
			func();
		}
	}
}

addLoadEvent(showIcons);

function showIcons() {
	//获取icon节点
	var icons = document.getElementsByClassName('icons')[0].getElementsByTagName('li'),
		wechat = document.getElementsByClassName('wechat')[0],
		qq = document.getElementsByClassName('qq')[0],
		aimFunction = document.getElementsByClassName('aim-function')[0],
		pMessage = document.getElementsByClassName('p-message')[0],
		pIntroduce = document.getElementsByClassName('p-introduce')[0];
	function showShortMes(index,obj) {
		icons[index].onmouseover = function() {
			obj.style.display = 'block';
		}
		icons[index].onmouseleave = function() {
			obj.style.display = 'none';
		}
	}
	showShortMes(0,wechat);
	showShortMes(1,qq);
	showShortMes(2,aimFunction);
	showShortMes(3,pMessage);
	showShortMes(4,pIntroduce);
}