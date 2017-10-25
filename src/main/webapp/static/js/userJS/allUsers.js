$("#show").click(function () {
    $("#convert").empty();
    $.ajax({
        url: '/show',
        type: 'GET',
        success: function (usersList) {
            console.log(usersList);
            for (let currentUser of usersList) {
                $('#convert').append($('<div/>', {text: currentUser.name}));
            }
        },
        error: function (err) {
            alert(err);
        }
    })
});

$('#send').click(function () {
    var imya = $('#name').val();
    var mulo = $('#email').val();
    console.log(imya);
    var user = {name: imya, email: mulo};
    user = JSON.stringify(user);
    $.ajax({
        url: '/saveUser',
        type: 'POST',
        data: user,
        contentType: 'application/json',
        success: function () {
        },
        error: function () {
            alert('no!');
        }
    });
})

