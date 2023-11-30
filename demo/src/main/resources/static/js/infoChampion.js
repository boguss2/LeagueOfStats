
document.addEventListener('DOMContentLoaded', function () {
    var input = document.getElementById('myInput');
    var list = document.getElementById('searchUL');
    var champions = document.getElementsByClassName("champion-item");
    list.style.display = 'none';

    input.addEventListener('focus', function () {
        list.style.display = 'block';
    });

    input.addEventListener('blur', function () {
        setTimeout(function () {
            list.style.display = 'none';
        }, 200);
    });

    function filterNames() {
        var filter = input.value.toLowerCase();
        for (var i = 0; i < champions.length; i++) {
            var champion = champions[i];
            var championName = champion.querySelector(".champion-name").textContent.toLowerCase();
            if (championName.indexOf(filter) > -1) {
                champion.style.display = "";
            } else {
                champion.style.display = "none";
            }
        }
    }

    for (var i = 0; i < champions.length; i++) {
        champions[i].addEventListener('click', function () {
            var championName = this.querySelector(".champion-name").textContent || this.querySelector(".champion-name").innerText;
            var currentChampionUrl = window.location.pathname;
            var vsUrl = '/vs/';
            var championUrl = currentChampionUrl + vsUrl + championName;
            window.location.href = championUrl;
        });
    }
});

function filterNames() {
    var filter = document.getElementById("myInput").value.toLowerCase();
    var champions = document.getElementsByClassName("champion-item");

    for (var i = 0; i < champions.length; i++) {
        var champion = champions[i];
        var championName = champion.querySelector(".champion-name").textContent.toLowerCase();
        if (championName.indexOf(filter) > -1) {
            champion.style.display = "";
        } else {
            champion.style.display = "none";
        }
    }
}
