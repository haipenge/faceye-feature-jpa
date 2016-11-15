/**
 * Build StringBuffer.
 */
var StringBuffer = function(arg0) {
	this.data = new Array();
	if ('' != arg0 && null != arg0) {
		this.data.push(arg0);
	}
};
StringBuffer.prototype = {
	append : function(arg0) {
		this.data.push(arg0);
		return this;
	},
	toString : function() {
		return this.data.join("");
	}
};

var Tools = {
	/**
	 * 生成随机整数
	 */
	random : function(min, max) {
		var range = max - min;
		var rand = Math.random();
		return (min + Math.round(rand * range));
	},
	/**
	 * 生成随机节点ID
	 */
	id : function(prefix) {
		var id = '';
		if (prefix != 'undefined' && prefix != null && prefix != '') {
			id = prefix + '-';
		} else {
			id = 'FaceYe-';
		}
		var randNum = Tools.random(100, 999);
		id += randNum;
		id += '-';
		id += ++Tools.config.idSeed;
		return id;
	},
	config:{
		idSeed:0
	}
};
/**
 * 全选，反选
 */
var Check = {
	/**
	 * 全选与反选
	 */
	onCheck : function(checkAll, checkSingle) {
		var isChecked = $(checkAll).is(':checked');
		if (isChecked == true) {
			$(checkSingle).each(function() {
				$(this).prop('checked', true);
			});
		} else {
			$(checkSingle).each(function() {
				$(this).prop('checked', false);
			});
		}
	},
	getCheckedIds : function(el) {
		var checked = $(el);
		var ids = "";
		$(checked).each(function() {
			if ($(this).is(':checked')) {
				var id = $(this).val();
				if (id !== '') {
					ids += id;
					ids += ',';
				}
			}
		});
		return ids;
	}
};
$(document).ready(function() {

});
$(document).ajaxComplete(function(event, xhr, settings) {
	if (xhr && xhr !== undefined && xhr !== null) {
		var responseText = xhr.responseText;
		if (responseText && responseText !== '' && responseText !== undefined) {
			// loginType
			var res = $.parseJSON(responseText);
			if (res && res != null && res !== undefined) {
				if (res.loginType && res.loginType === 'ajax') {
					Login.window();
				}
			}
		}
	}
});
