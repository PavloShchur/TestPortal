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


$("#showArticle").click(function () {

    console.log('showArticle');

    $("#convert").empty();
    $.ajax({
        url: '/showArticle',
        type: 'GET',
        success: function (articlesList) {
            for (let currentArticle of articlesList) {
                $('#convert').append($('<div/>',
                    {text: currentArticle.descriptionOfAnswer}));

                console.log('currentArticle.descriptionOfAnswer = '
                    + currentArticle.descriptionOfAnswer);

            }

            console.log('success');

        },
        error: function (err) {
            alert(err);
        }
    })
});

