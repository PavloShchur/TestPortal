$('#send').click(function () {
    var title = $('#titleOfArticle').val();
    var article = {titleOfArticle: title};
    article = JSON.stringify(article);
    $.ajax({
        url: '/saveArticle',
        type: 'POST',
        data: article,
        contentType: 'application/json',
        success: function () {
        },
        error: function () {
            alert('no!');
        }
    });
})


$("#show").click(function () {
    $("#convert").empty();
    $.ajax({
        url: '/show',
        type: 'GET',
        success: function (articlesList) {
            for (let currentArticle of articlesList) {
                $('#convert').append($('<div/>', {text: currentArticle.descriptionOfAnswer}));
            }
        },
        error: function (err) {
            alert(err);
        }
    })
});

