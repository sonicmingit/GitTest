/** 时间控件的方法,禁止结束时间大于开始时间 */
try {
	// 开始时间:
	$('#lastStart').datepicker({
		language : 'zh-CN',
		todayBtn : "linked",
		autoclose : true,
		todayHighlight : true,
		clearBtn : true
	// endDate : new Date()
	}).on('changeDate', function(e) {
		var startTime = e.date;
		$('#lastEnd').datepicker('setStartDate', startTime);
	});
	// 结束时间：
	$('#lastEnd').datepicker({
		language : 'zh-CN',
		todayBtn : "linked",
		autoclose : true,
		todayHighlight : true,
		clearBtn : true
	// endDate : new Date()
	}).on('changeDate', function(e) {
		var endTime = e.date;
		$('#lastStart').datepicker('setEndDate', endTime);
	});
} catch (e) {
	// 没有引入时间控件
}


/** 下拉列表默认参数 */
if (!ace.vars['touch']) {
	$('.chosen-select').chosen({
		allow_single_deselect : true
	});
	$(window).off('resize.chosen').on('resize.chosen', function() {
		$('.chosen-select').each(function() {
			var $this = $(this);
			$this.next().css({
				'width' : $this.parent().width()
			});
		});
	}).trigger('resize.chosen');
	$(document).on('settings.ace.chosen', function(e, event_name, event_val) {
		if (event_name != 'sidebar_collapsed')
			return;
		$('.chosen-select').each(function() {
			var $this = $(this);
			$this.next().css({
				'width' : $this.parent().width()
			});
		});
	});
	$('#chosen-multiple-style .btn').on('click', function(e) {
		var target = $(this).find('input[type=radio]');
		var which = parseInt(target.val());
		if (which == 2)
			$('#form-field-select-4').addClass('tag-input-style');
		else
			$('#form-field-select-4').removeClass('tag-input-style');
	});
}



/** 复选框全选控制 */
var active_class = 'active';
$('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function(){
	var th_checked = this.checked;// checkbox inside "TH" table header
	$(this).closest('table').find('tbody > tr').each(function(){
		var row = this;
		if(th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
		else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
	});
});
});