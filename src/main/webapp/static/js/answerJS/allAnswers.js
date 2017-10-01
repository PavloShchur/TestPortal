$('#send').click(function () {
    var description = $('#descriptionOfAnswer').val();
    console.log(description);
    var answer = {descriptionOfAnswer: description};
    answer = JSON.stringify(answer);
    $.ajax({
        url: '/saveAnswer',
        type: 'POST',
        data: answer,
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
        success: function (answersList) {
            for (let currentAnswer of answersList) {
                $('#convert').append($('<div/>', {text: currentAnswer.descriptionOfAnswer}));
            }
        },
        error: function (err) {
            alert(err);
        }
    })
});

