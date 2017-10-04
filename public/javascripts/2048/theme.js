
var themeExternalUrl = 0;
var themeId = 1;
var themeImageData = [
// theme 1
[ 
"1-1.png",
"1-2.jpg",
"1-3.jpg",
"1-4.jpg",
"1-5.jpg",
"1-6.jpg",
"1-7.jpg",
"1-8.jpg",
"1-9.jpg",
"1-10.jpg",
"1-11.jpg"
 ],

 //theme 2
 [ 
"1-1.png",
"1-2.jpg",
"1-3.jpg",
"1-4.jpg",
"1-5.jpg",
"1-6.jpg",
"1-7.jpg",
"1-8.jpg",
"1-9.jpg",
"1-10.jpg",
"1-11.jpg"
 ]

];

var Theme_updateTileLook = function(innerelement, tileValue) {
  var elem = document.createElement("img");
  elem.className += "tile-img";
  innerelement.appendChild(elem);
  elem.src = tileImageValue(tileValue);
}

var tileImageValue = function(tileValue) {
  var image = "theme/1-2.jpg";
  if(themeExternalUrl == 0) {
  image = "/assets/images/2048/theme/"+themeId+"/"+ themeImageData[themeId-1][tileValue-1];
  } else {
   image = themeImageData[themeId-1][tileValue-1];
  }
  return image;
}


//class 
function Theme () {
  // body...
}

Theme.tileLook = function (tileValue) {
  return tileValue+"A";
}
