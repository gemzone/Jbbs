



//$(document).ready(function () {
//	"use strict";
//	var lang = getUrlParameter("lang");
//
//	jQuery.i18n.properties({
//		name: 'Messages',
//		path: 'i18n/',
//		mode: 'map',
//		language: (lang == undefined ? navigator.language : lang),
//		callback: function () {
//			translation();
//		}
//	});
//
//	DEBUG = false;
//	localStorage.clear();
//	CACHE = false;


	//server_statistics_view("server_chart_mem0", "server_chart_user0", "192.168.94.50", 1);
	//server_statistics_view("server_chart_mem1", "server_chart_user1", "192.168.94.12", 1);
	
//});

function loginEnterKey(e) {

	var key = e.keyCode || e.which;
	if (key == 13) {
		user.login($('#id').val(), $('#password').val());
	}

}

function translation() {
	// var regex = "\[(i:.*?)\]";
	$("body span,th,label,button,select option").each(function (i, o) {
		var val = $(o).text().trim();
		if ($.i18n.map[val] != undefined) {
			$(o).text($.i18n.prop(val));
		}
	});
	
	
}
