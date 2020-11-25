window.addEventListener("load",init);

function init(){
	
	navBar();
	
};

/*-------------------------------------let init-----------------------------------------*/

let navBar = function (){
	
	let navSecond = document.getElementsByClassName('nav-second');
	navSecond.id = "nav_second";
	
	let navIcon = document.getElementById('nav-icon4');
	
	navIcon.addEventListener('click', toggle);
	
}



/*----------------------------------function--------------------------------------------*/

function toggle(){
	
let firstSpan = document.getElementById('span_1');
let secondSpan = document.getElementById('span_2');

	let body = document.body;
	
	if(body.className === "open"){
		body.removeAttribute("class","open");
		this.removeAttribute("class","open");
		firstSpan.style.background = "#ffffff"
		secondSpan.style.background = "#ffffff"
	
	}else{
		body.className = 'open';
		this.className = 'open';
		firstSpan.style.background = "#000000"
		secondSpan.style.background = "#000000"
	}
}