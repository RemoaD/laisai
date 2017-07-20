var person = document.getElementsByClassName('oneperson');
for(var i = 0;i < person.length;i++) {
	var a = person[i].getElementsByTagName('a')[0];
	a.onclick = function() {
		lookPerson();
	}
}

function lookPerson() {

	//遮罩层
	var wWidth = document.body.scrollWidth,
		wHeight = document.body.scrollHeight,
		mask = document.createElement('div');
	mask.id = 'mask2';
	mask.style.width = wWidth + 'px';
	mask.style.height = wHeight + 'px';
	document.body.appendChild(mask);
	mask.onclick = function() {
		document.body.removeChild(mask);
		document.body.removeChild(personBox);
	}

	//创建个人页面
	var personBox = document.createElement('div');
	personBox.innerHTML = '';
	personBox.className = 'team-members';
	personBox.style.top = (wHeight/32-35/2) + 'rem';
	personBox.style.left = (wWidth/32-50/2) + 'rem';
	document.body.appendChild(personBox);

	//点击×关闭弹出层
	var closeBtn = document.getElementById('closeBtn2').getElementsByTagName('a')[0];
	closeBtn.onclick = function() {
		document.body.removeChild(mask);
		document.body.removeChild(personBox);
	}
}