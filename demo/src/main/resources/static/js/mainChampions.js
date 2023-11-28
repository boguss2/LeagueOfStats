var championItems = document.getElementsByClassName("champion-item");

for (var i = 0; i < championItems.length; i++) {
    championItems[i].addEventListener("click", function () {
        var championName = this.getElementsByClassName("champion-name")[0].textContent || this.getElementsByClassName("champion-name")[0].innerText;
        var championUrl = '/champions/' + championName;
        window.location.href = championUrl;
    });
}

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

var championsData = /*[[${championsData}]]*/ [];

document.addEventListener('DOMContentLoaded', function () {

    function collectInformation() {
        console.log(championsData);

        var classSet = new Set();
        var championsArray = Object.values(championsData);

        championsArray.forEach(function (entry) {
            entry.tags.forEach(function (tag) {
                classSet.add(tag);
            });
        });

        var classArray = Array.from(classSet);
        var classNamesDiv = document.getElementById('class-names');
        if (classNamesDiv) {
            classNamesDiv.innerHTML = '';
            classArray.forEach(function (className, index) {
                classNamesDiv.innerHTML += '<span>' + className + '</span>';
                if (index < classArray.length - 1) {
                    classNamesDiv.innerHTML += '<span>, </span>';
                }
            });
        }
    }

    var collectInfoButton = document.getElementById('collectInfoButton');
    if (collectInfoButton) {
        collectInfoButton.addEventListener('click', collectInformation);
    }

    function filterChampionsByTag() {
        var selectedTag = document.getElementById('tagFilter').value.toLowerCase();
        var champions = document.getElementsByClassName("champion-item");

        for (var i = 0; i < champions.length; i++) {
            var champion = champions[i];
            var championTags = champion.getAttribute('data-classes').toLowerCase().split(',');

            if (championTags.includes(selectedTag) || selectedTag === 'all') {
                champion.style.display = "";
            } else {
                champion.style.display = "none";
            }
        }
    }

    var tagFilterDropdown = document.getElementById('tagFilter');
    if (tagFilterDropdown) {
        tagFilterDropdown.addEventListener('change', filterChampionsByTag);
    }
});
