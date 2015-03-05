/**
 * Created by nicole on 3/5/15 AD.
 */
var radioInput=[];
(function() {
    $(function() {
        return $.get("/voteResult", function(project) {
            return $.each(project, function(index, project ) {
                return $('#list').append($("<input type='radio' name='project' value="+project.ID+">"+project.name+"<br>"));
            });
        });
    });

}).call(this);