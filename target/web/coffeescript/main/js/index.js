(function() {
  $(function() {
    return $.get("/votes", function(persons) {
      return $.each(persons, function(index, person) {
        return $('#persons').append($("<li>").text(person.name));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
