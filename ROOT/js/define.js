var dataXml = "<jbbs></jbbs>";
var rootElementName = "jbbs";

$(document).ready(function () {

	// Shortcut Keys Bind
	$(document).bind("keydown", function (e) {
	    switch (e.keyCode) {
	        // ESC
	        case 27: {
	            //closeWindow();
	            break;
	        }
	        // ENTER
	        case 13: {
	            break;
	        }
	        case 113: {
	    	  //window.showModalDialog(document.location.href, this, 'dialogWidth=1024px;dialogHeight=768px;resizable=no;status=no;scrollbars=no;help:no;');
	          break;
	        }
	        case 38: {
	        //    log("keydown:: ??);
	            break;
	        }
	        case 40: {
	          //  log("keydown:: ??);
	            break;
	        }
	        case 37: {
	         //   log("keydown:: ??");
	            break;
			}
	        case 39: {
	        //    log("keydown:: ??);
	        	break;
	        }
	        case 192:{
	            //
	        	break;
	        }
	        default: {
	        	//   	log(e.keyCode);
	        	break;
	        }
	    }
	});
	
	// Orientation
	if (window.orientation != undefined) {
	    switch (window.orientation) {
	        case 0:
	            {
	                log("orient 0");
	            }
	            break;
	        case -90:
	            {
	                log("orient -90");
	            }
	            break;
	        case 90:
	            {
	                log("orient 90");
	            }
	            break;
	        default:
	            {}
	            break;
	    }
	}
	
	$(document).bind("orientationchange", function (e) {
	    log(screen.width);
	});

});






