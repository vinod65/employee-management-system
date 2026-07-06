// ================================
// Employee Search
// ================================

function searchEmployee() {

    let input = document.getElementById("searchInput");

    if (!input) return;

    let filter = input.value.toUpperCase();

    let table = document.getElementById("employeeTable");

    let tr = table.getElementsByTagName("tr");

    for (let i = 1; i < tr.length; i++) {

        let td = tr[i].getElementsByTagName("td");

        let found = false;

        for (let j = 0; j < td.length - 1; j++) {

            if (td[j]) {

                let txt = td[j].textContent || td[j].innerText;

                if (txt.toUpperCase().indexOf(filter) > -1) {

                    found = true;

                }

            }

        }

        tr[i].style.display = found ? "" : "none";

    }

}

// ================================
// Delete Confirmation
// ================================

function confirmDelete(){

    return confirm("Are you sure you want to delete this employee?");

}

// ================================
// Button Animation
// ================================

document.addEventListener("DOMContentLoaded", function(){

    let buttons=document.querySelectorAll(".btn,.add-btn,.edit-btn,.delete-btn");

    buttons.forEach(function(btn){

        btn.addEventListener("mouseenter",function(){

            btn.style.transform="scale(1.05)";

        });

        btn.addEventListener("mouseleave",function(){

            btn.style.transform="scale(1)";

        });

    });

});

// ================================
// Input Focus Effect
// ================================

document.addEventListener("DOMContentLoaded",function(){

    let inputs=document.querySelectorAll("input");

    inputs.forEach(function(input){

        input.addEventListener("focus",function(){

            input.style.background="#f8fbff";

        });

        input.addEventListener("blur",function(){

            input.style.background="#ffffff";

        });

    });

});