/**
 * Created by nicole on 3/4/15 AD.
 */
(function() {
    $(function() {
        return $.get("/voteResult", function(project) {
            return $.each(project, function(index, project ) {
                return $('#projects').append($("<li>").text(project.name+" "+project.Vscore));
            });
        });
    });

}).call(this);