/*
	Copyright 2014  <Daniel García Merino>
   
   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
   MA 02110-1301, USA. 
 */
 
	var barcos = { 1:"lancha" };
	barcos = { 2:"fragata" };
	barcos = { 3:"submarino" };
	barcos = { 4:"destructor" };
	barcos = { 5:"porta aviones" };
	//var bomba;
	var barcosvidas1;
	var barcosvidas2;
	var barcosvidas3;
	var barcosvidas4;
	var barcosvidas5;
	var vidas;
	
	
	//florida WAY
	/*function menuPrincipal() {			
			document.getElementById("principal").innerHTML = "<div id='menu'> \
				<nav> \
					<ul> \
						<li>Imagen</li> \
						<li onclick='menuPartida()'>Crear partida</li> \
						<li onclick='Créditos'>Créditos</li> \
						<li>Salir de la aplicación</li> \
					</ul> \
				</nav> \
			</div>";
		}*/
		
	function menuPrincipal() {
			
			// cargo en la variable el <div id='principal'> </div>
			var nodoPrincipal = document.getElementById('principal');
			nodoPrincipal.innerHTML='';
			
			// creo un nodo <div id='menu'> </div>
			var nodoMenu = document.createElement('div');
			nodoMenu.setAttribute('id', 'menu');
			// anido el nodo con id=menu dentro de id=principal
			nodoPrincipal.appendChild(nodoMenu);
			
			var nodoNav = document.createElement('nav');
			nodoMenu.appendChild(nodoNav);			
			
			var nodoUL = document.createElement('ul');
			nodoNav.appendChild(nodoUL);
			
			var nodoLI = document.createElement('li');
			var imagen = document.createElement('img');
			imagen.setAttribute( 'src','img/logo.jpg');
			imagen.setAttribute( 'class','portada');
			nodoLI.appendChild(imagen);
			nodoUL.appendChild(nodoLI);
			
			nodoLI = document.createElement('li');
			nodoLI.setAttribute('onclick','menuPartida()');
			var nodoTexto = document.createTextNode('Partida Personalizada');
			nodoLI.appendChild(nodoTexto);
			nodoUL.appendChild(nodoLI);
			
			nodoLI = document.createElement('li');
			nodoLI.setAttribute('onclick','crearTablero3( 6 , 6 );');
			var nodoTexto = document.createTextNode('Partida Rápida');
			nodoLI.appendChild(nodoTexto);
			nodoUL.appendChild(nodoLI);

			nodoLI = document.createElement('li');
			nodoLI.setAttribute('onclick','instrucciones()');
			var nodoTexto = document.createTextNode('Instrucciones');
			nodoLI.appendChild(nodoTexto);
			nodoUL.appendChild(nodoLI);

			nodoLI = document.createElement('li');
			nodoLI.setAttribute('onclick','creditos()');
			var nodoTexto = document.createTextNode('Créditos');
			nodoLI.appendChild(nodoTexto);
			nodoUL.appendChild(nodoLI);
			
		}
	
	//instrucciones
	function instrucciones(){
		var nodoPrincipal = document.getElementById("principal");
		nodoPrincipal.innerHTML="";
		var div = document.createElement("div");
		div.setAttribute("class","creditos");
	//audio
		var audio = document.createElement("audio"); 
		audio.setAttribute("src","sound/music.mp3");
		audio.setAttribute("preload","auto");
		audio.setAttribute("autoplay","true");
		div.appendChild(audio);
	//linea1
		var linea1 = document.createElement("h3"); //textos de los creditos insertados en etiquetas h3
		div.appendChild(linea1);
		var textolinea1 = document.createTextNode("INSTRUCCIONES");
		linea1.appendChild(textolinea1);
		var parrafo1 = document.createElement("p"); //textos de los creditos insertados en etiquetas h3
		div.appendChild(parrafo1);
		var textoparrafo1 = document.createTextNode("El juego consiste en ir pinchando sobre las celdas y destruir 5 barcos de diferentes tamaños: lancha de 1, fragata de 2, submarino de 3, destructor de 4 y portaviones de 5. Cuidado que en el tablero hay una bomba, si la pinchas pierdes.");
		parrafo1.appendChild(textoparrafo1);
	//boton volver
		var Volver2 = document.createElement("button"); //boton para volver al menu principal
		div.appendChild(Volver2);
		var textoBoton = document.createTextNode("Volver");//nombre del boton
		Volver2.appendChild(textoBoton);
		Volver2.setAttribute("onclick","menuPrincipal()");//llamo a menu principal
		nodoPrincipal.appendChild(div);
		
	}
		
	//creditos
	function creditos(){
		var nodoPrincipal = document.getElementById("principal");
		nodoPrincipal.innerHTML="";
		var div = document.createElement("div");
		div.setAttribute("class","creditos");
	//audio
		var audio = document.createElement("audio"); 
		audio.setAttribute("src","sound/music.mp3");
		audio.setAttribute("preload","auto");
		audio.setAttribute("autoplay","true");
		div.appendChild(audio);
	//linea1
		var linea1 = document.createElement("h3"); //textos de los creditos insertados en etiquetas h3
		div.appendChild(linea1);
		var textolinea1 = document.createTextNode("DESARROLLADO POR:");
		linea1.appendChild(textolinea1);
	//linea2
		var linea2 = document.createElement("h3");
		div.appendChild(linea2);
		var textolinea2 = document.createTextNode("Daniel García Merino");
		linea2.appendChild(textolinea2);
	//linea3
		var linea3 = document.createElement("h3");
		div.appendChild(linea3);
		var textolinea3 = document.createTextNode("BATTLESHIP");
		linea3.appendChild(textolinea3);
	//linea4
		var linea4 = document.createElement("h3");
		div.appendChild(linea4);
		var textolinea4 = document.createTextNode("10/12/2014");
		linea4.appendChild(textolinea4);
	//linea5
		var linea5 = document.createElement("h3");
		div.appendChild(linea5);
		var textolinea5 = document.createTextNode("Version: '1.0'");
		linea5.appendChild(textolinea5);
	//linea6
		var linea6 = document.createElement("h3");
		div.appendChild(linea6);
		var enlace = document.createElement("a");
		linea6.appendChild(enlace);
		enlace.setAttribute("href","https://www.youtube.com/watch?v=bqDarafki1U");
		var textolinea6 = document.createTextNode("Epic Battle Music Mix I");
		enlace.appendChild(textolinea6);
	//imagen de bandera
		var bandera = document.createElement("img");
		bandera.setAttribute("src","img/bandera.jpg");//llamo a menu principal
		div.appendChild(bandera);
	//boton volver
		var Volver = document.createElement("button"); //boton para volver al menu principal
		div.appendChild(Volver);
		var textoBoton = document.createTextNode("Volver");//nombre del boton
		Volver.appendChild(textoBoton);
		Volver.setAttribute("onclick","menuPrincipal()");//llamo a menu principal
		nodoPrincipal.appendChild(div);
	
}	
	
	// Creamos un tablero editando directamente etiquetas HTML (sin DOM)
		/*function crearTablero(tamX, tamY) {
			var html = "<div id='tablero'><table border='2px'>";
			for (var i=0; i<tamY; i++ ) {
				html += "<tr>";
				for (var j=0; j<tamX; j++) {
					html += "<td onclick='disparo("+i+", "+j+")'>O</td>";
				}
				html += "</tr>";
			}
			html += "</table></div>";
			document.getElementById("principal").innerHTML = html;
			
		}*/
		
		
		// Creamos un tablero con la API DOM
		function crearTablero2(tamX, tamY) {
			 barcosvidas1=1;
			 barcosvidas2=2;
			 barcosvidas3=3;
			 barcosvidas4=4;
			 barcosvidas5=5;
			// Para crear la matriz necesitamos hacer un vector de vectores.
			oceano = new Array(tamY);
			
			for (var i = 0; i < tamY; i++) {
				oceano[i]=new Array(tamX);
			}
			
			var divTablero = document.createElement("div");
			divTablero.setAttribute("id","tablero");
			
			var tabla = document.createElement("tabla");
			tabla.setAttribute("border","2px");
			tabla.setAttribute("class","oceano");
			
			var tmpTR;
			var tmpTD;
			var tmpTexto;
			var tmpFun;
			
			for (var i=0; i<tamY; i++ ) {				
				for (var j=0; j<tamX; j++) {
					oceano[i][j] = 'a';
				}
			}
			
			var cuantos = (tamX > 12 && tamY > 12) ? 5 : 3;

			colocarBarcos(tamX, tamY, cuantos);
			
			for (var i=0; i<tamY; i++ ) {
				tmpTR = document.createElement("tr");				
				for (var j=0; j<tamX; j++) {
					//oceano[i][j] = 'a';
					tmpTD = document.createElement("td");
					tmpFun="disparo("+i+", "+j+")";
					tmpTD.setAttribute("onclick" , tmpFun);
					tmpTD.setAttribute("id","td_"+i+"_"+j);
					tmpTD.setAttribute("class","blanco");
					tmpTexto=document.createTextNode(/*oceano[i][j]*/" ");//0
					tmpTD.appendChild(tmpTexto);
					tmpTR.appendChild(tmpTD);
				}
				tabla.appendChild(tmpTR);
			}			
			
			divTablero.appendChild(tabla);
			
			var divPartida = document.getElementById("menupartida");
			var divPrincipal = document.getElementById("principal");
			
			
			divPrincipal.appendChild(divTablero);
			divPrincipal.removeChild(divPartida);
			
			vidas=tamX*tamY/2;
			
			
			var botonVolver = document.createElement("button");
			var textoVolver = document.createTextNode("Volver");
			botonVolver.appendChild(textoVolver);
			botonVolver.setAttribute("onclick", "menuPrincipal()");
			tabla.appendChild(botonVolver);
			
			
			
		}
		
		// Creamos un tablero con la API DOM para PARTIDA RAPIDA
		function crearTablero3(tamX, tamY) {
			 barcosvidas1=1;
			 barcosvidas2=2;
			 barcosvidas3=3;
			 barcosvidas4=4;
			 barcosvidas5=5;
			// Para crear la matriz necesitamos hacer un vector de vectores.
			var nodoPrincipal = document.getElementById("principal");
			nodoPrincipal.innerHTML="";
			oceano = new Array(tamY);
			
			for (var i = 0; i < tamY; i++) {
				oceano[i]=new Array(tamX);
			}
			
			var divTablero = document.createElement("div");
			divTablero.setAttribute("id","tablero");
			
			var tabla = document.createElement("tabla");
			tabla.setAttribute("border","2px");
			tabla.setAttribute("class","oceano");
			
			var tmpTR;
			var tmpTD;
			var tmpTexto;
			var tmpFun;
			
			for (var i=0; i<tamY; i++ ) {				
				for (var j=0; j<tamX; j++) {
					oceano[i][j] = 'a';
				}
			}
			
			var cuantos = (tamX > 12 && tamY > 12) ? 5 : 3;

			colocarBarcos(tamX, tamY, cuantos);
			
			for (var i=0; i<tamY; i++ ) {
				tmpTR = document.createElement("tr");				
				for (var j=0; j<tamX; j++) {
					// oceano[i][j] = 'a';
					tmpTD = document.createElement("td");
					tmpFun="disparo("+i+", "+j+")";
					tmpTD.setAttribute("onclick" , tmpFun);
					tmpTD.setAttribute("id","td_"+i+"_"+j);
					tmpTD.setAttribute("class","blanco");
					tmpTexto=document.createTextNode(/*oceano[i][j]*/" ");//0
					tmpTD.appendChild(tmpTexto);
					tmpTR.appendChild(tmpTD);
				}
				tabla.appendChild(tmpTR);
			}			
			
			divTablero.appendChild(tabla);
			
			var divPartida = document.getElementById("menupartida");
			var divPrincipal = document.getElementById("principal");
			
			
			divPrincipal.appendChild(divTablero);
			
			
			vidas=tamX*tamY/2;
			
			
			
			var botonVolver = document.createElement("button");
			var textoVolver = document.createTextNode("Volver");
			botonVolver.appendChild(textoVolver);
			botonVolver.setAttribute("onclick", "menuPrincipal()");
			divTablero.appendChild(botonVolver);
			
			
		}
		
		
		function colocarBarcos(tamX, tamY, numBarcos) {
			// tiro un dado de 10
			var dado; 
			var orientacion;
			var barcoX, barcoY;

		/*	for (var i=0; i<1; i++) 
			{*/
			
			// vamos a colocar el porta aviones
			//TAMAÑO = 5
			var creacion = false;
				while (creacion==false) {
					
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-5));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX][barcoY+1]=='a' && oceano[barcoX][barcoY+2]=='a' && oceano[barcoX][barcoY+3] == 'a' && oceano[barcoX][barcoY+4] == 'a' ) {   
						oceano[barcoX][barcoY]='p';
						oceano[barcoX][barcoY+1]='p';
						oceano[barcoX][barcoY+2]='p';
						oceano[barcoX][barcoY+3]='p';
						oceano[barcoX][barcoY+4]='p';
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-5));
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX+1][barcoY]=='a' && oceano[barcoX+2][barcoY]=='a' && oceano[barcoX+3][barcoY] == 'a' ) {   
						oceano[barcoX][barcoY]='p';
						oceano[barcoX+1][barcoY]='p';
						oceano[barcoX+2][barcoY]='p';
						oceano[barcoX+3][barcoY]='p';
						oceano[barcoX+4][barcoY]='p';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			}
			// vamos a colocar el destructor 
			//TAMAÑO = 4
				var creacion = false;
				while (creacion==false) {
					
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-4));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX][barcoY+1]=='a' && oceano[barcoX][barcoY+2]=='a' && oceano[barcoX][barcoY+3] == 'a' ) {   
						oceano[barcoX][barcoY]='d';
						oceano[barcoX][barcoY+1]='d';
						oceano[barcoX][barcoY+2]='d';
						oceano[barcoX][barcoY+3]='d';
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-4));
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX+1][barcoY]=='a' && oceano[barcoX+2][barcoY]=='a' && oceano[barcoX+3][barcoY] == 'a' ) {   
						oceano[barcoX][barcoY]='d';
						oceano[barcoX+1][barcoY]='d';
						oceano[barcoX+2][barcoY]='d';
						oceano[barcoX+3][barcoY]='d';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			}
			//crear submarino 
			//de tamaño 3
			 creacion = false;
			while (creacion==false) {
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-3));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX][barcoY+1]=='a' && oceano[barcoX][barcoY+2]=='a'  ) {   
						oceano[barcoX][barcoY]='s';
						oceano[barcoX][barcoY+1]='s';
						oceano[barcoX][barcoY+2]='s';
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-3));
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX+1][barcoY]=='a' && oceano[barcoX+2][barcoY]=='a' ) {   
						oceano[barcoX][barcoY]='s';
						oceano[barcoX+1][barcoY]='s';
						oceano[barcoX+2][barcoY]='s';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			}
			//crear fragata 
			//de tamaño 2
			 creacion = false;
			while (creacion==false) {
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-2));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX][barcoY+1]=='a'   ) {   
						oceano[barcoX][barcoY]='f';
						oceano[barcoX][barcoY+1]='f';	
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-2));
					if (oceano[barcoX][barcoY]=='a' && oceano[barcoX+1][barcoY]=='a' ) {   
						oceano[barcoX][barcoY]='f';
						oceano[barcoX+1][barcoY]='f';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			}
			//crear lancha 
			//de tamaño 1
			 creacion = false;
			while (creacion==false) {	
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-1));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a'   ) {   
						oceano[barcoX][barcoY]='l';		
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-1));
					if (oceano[barcoX][barcoY]=='a' ) {   
						oceano[barcoX][barcoY]='l';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			} 
			//crear bomba 
			//de tamaño 1, si pinchas en ella pierdes la partida
			creacion = false;
			while (creacion==false) {	
				dado = Math.floor((Math.random() * 10) + 1); 
				// compruebo si es par o impar
				if ( dado%2 == 1) { //impar
					// orientacion = "vertical";
					barcoY = Math.floor(Math.random() * (tamY-1));
					barcoX = Math.floor(Math.random() * tamX);
					if (oceano[barcoX][barcoY]=='a'   ) {   
						oceano[barcoX][barcoY]='b';		
						creacion=true;
					} else {
						creacion=false;
					}
				} else { // par
					//orientacion = "horizontal";
					barcoY = Math.floor(Math.random() * tamY);
					barcoX = Math.floor(Math.random() * (tamX-1));
					if (oceano[barcoX][barcoY]=='a' ) {   
						oceano[barcoX][barcoY]='b';
						creacion=true;
					} else {
						creacion=false;
					}
				}
			}
		}
		
		function menuPartida() {
			var nodo = document.getElementById("principal");		
			var hijo = document.getElementById("menu");
			nodo.removeChild(hijo);
			
			// la "florida way" 
			
			// la manera fácil
			// nodo.innerHTML="";
			
			// usando DOM
			 /* nodo.innerHTML="<form> \
				<input type='text' id='tamaX' placeholder='ancho'/> \
				<input type='text' id='tamaY' placeholder='alto'/> \
				<button> Aceptar </button> \
				<button> Cancelar </button> \
			</form>"; */
			
			// crea <div id='partida'> </div>
			var divMenuPartida = document.createElement("div");
			divMenuPartida.setAttribute("id","menupartida");
			
			// crea <button onclick='pulsarPartida()'>Aceptar</button>
			var botonAceptar = document.createElement("button");
			var textoAceptar = document.createTextNode("Aceptar");
			botonAceptar.appendChild(textoAceptar);
			
			botonAceptar.setAttribute("onclick", "pulsarCrearPartida()");
			
			// crea <button onclick='menuPrincipal()'>Cancelar</button>
			var botonCancelar = document.createElement("button");
			var textoCancelar = document.createTextNode("Cancelar");
			botonCancelar.appendChild(textoCancelar);
			
			botonCancelar.setAttribute("onclick", "menuPrincipal()");
			
			// crea <input type='text' id='tamaX' placeholder='Ancho del tablero' />
			var inputTamaX = document.createElement("input");
			inputTamaX.setAttribute("type","text");
			inputTamaX.setAttribute("id","tamaX");
			inputTamaX.setAttribute("placeholder", "Ancho del tablero");
			
			// crea <input type='text' id='tamaY' placeholder='Alto del tablero' />
			var inputTamaY = document.createElement("input");
			inputTamaY.setAttribute("type","text");
			inputTamaY.setAttribute("id","tamaY");
			inputTamaY.setAttribute("placeholder", "Alto del tablero");
			
			// mete los botones y los input text dentro del div MenuPartida
			divMenuPartida.appendChild(inputTamaX);
			divMenuPartida.appendChild(inputTamaY);
			divMenuPartida.appendChild(botonAceptar);
			divMenuPartida.appendChild(botonCancelar);
			
			// mete el div MenuPartida dentro del principal
			nodo.appendChild(divMenuPartida);
		}
		
		// funcion auxiliar para crear el tablero.
		function pulsarCrearPartida() {			
			 var tamX = document.getElementById("tamaX").value;
			 var tamY = document.getElementById("tamaY").value;
			if ( (tamX >= 6) && (tamX <= 25) && (tamY >= 6) && (tamY <= 25) ) {
				crearTablero2( tamX , tamY );
			}
		}
		
		
		
		function disparo(disX, disY) {
			
		if(vidas>=1){
			if (vidas==2) alert ("Cuidado!! Es tu último intento, tendrás otra oportunidad si pinchas en un barco!")
			//lancha			
			if (oceano[disX][disY] =='l') { 
				 barcosvidas1-=1;
				 if(barcosvidas1==0) alert ("Lancha Hundida, te quedan "+vidas+" vidas");
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","barco");
				 
				 //--vidas;
				}
			//fragata
			if (oceano[disX][disY] =='f') { 
				 barcosvidas2-=1;
				// alert ("Tocado");
				 if(barcosvidas2==0) alert ("Fragata Hundida, te quedan "+vidas+" vidas");
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","barco");
				 //--vidas;
				}
			//submarino
			if (oceano[disX][disY] =='s') { 
				 barcosvidas3-=1;
				// alert ("Tocado");
				 if(barcosvidas3==0) alert ("Submarino Hundido, te quedan "+vidas+" vidas");
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","barco");
				 //--vidas;
				}
			//destructor
			if (oceano[disX][disY] =='d') { 
				 barcosvidas4-=1;
				 //alert ("Tocado");
				 if(barcosvidas4==0) alert ("Destructor Hundido, te quedan "+vidas+" vidas");
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","barco");
				//--vidas;
				}
			//porta-aviones
			if (oceano[disX][disY] =='p') { 
				 barcosvidas5-=1;
				// alert ("Tocado");
				 if(barcosvidas5==0) alert ("Portaviones Hundido, te quedan "+vidas+" vidas");
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","barco");
				 //--vidas;
				}
			//bomba
			if (oceano[disX][disY] =='b') { 
				 oceano[disX][disY]='A';	
				 var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","bomba");
				 alert ("OH NO!! pinchaste en la bomba!");
				 var nodoPrincipal = document.getElementById('principal');
				 nodoPrincipal.innerHTML='';	
				 var imagenLose = document.createElement("img");
				 imagenLose.setAttribute( 'src','img/lose.jpg');
				 imagenLose.setAttribute( 'onclick','menuPrincipal()');			
				 nodoPrincipal.appendChild(imagenLose);
				 var textoSalir_1 = document.createElement("h3");
				 var texto_1 = document.createTextNode("Pincha en la imagen para SALIR");
				 textoSalir_1.appendChild(texto_1);
				 nodoPrincipal.appendChild(textoSalir_1);
				}
				
			// alert('Has disparado en la posición ('+disX+','+disY+') = '+oceano[disX][disY]);
			if (oceano[disX][disY] =='a') { 
				// alert('AGUA');
				oceano[disX][disY]='A';
				var nodo=document.getElementById("td_"+disX+"_"+disY);
				 nodo.setAttribute("class","agua"); 
				 --vidas;
			} else {
				if (oceano[disX][disY] =='A') { 
					// alert('Ya habías disparado en esa posición!');
				}
				else {
					alert ('Encontrado barco en: '+disX+','+disY);
					}
				
				}
			if(barcosvidas1==0&&barcosvidas2==0&&barcosvidas3==0&&barcosvidas4==0&&barcosvidas5==0){
				alert ("You Win");
				var nodoPrincipal = document.getElementById('principal');
				nodoPrincipal.innerHTML='';	
				var imagenWin = document.createElement("img");
				imagenWin.setAttribute( 'src','img/win.png');
				imagenWin.setAttribute( 'onclick','menuPrincipal()');
				nodoPrincipal.appendChild(imagenWin);
				}
			}else{
				alert ("Game Over");
				var nodoPrincipal = document.getElementById('principal');
				nodoPrincipal.innerHTML='';	
				var imagenLose = document.createElement("img");
				imagenLose.setAttribute( 'src','img/lose.jpg');
				imagenLose.setAttribute( 'onclick','menuPrincipal()');			
				nodoPrincipal.appendChild(imagenLose);
				var textoSalir_1 = document.createElement("h3");
				var texto_1 = document.createTextNode("Pincha en la imagen para SALIR");
				textoSalir_1.appendChild(texto_1);
				nodoPrincipal.appendChild(textoSalir_1);
				
			}
	}	
