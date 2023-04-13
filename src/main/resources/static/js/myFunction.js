
//experiencia
function addSection() {
	document.getElementById("addform").innerHTML +=
	"<form action=''method='' id='form-experience'>"+
		"<div class='form-group'>" +
		"<label for='title2'>Titulo:</label>" +
		"<input type='text' class='form-control' id='title-experience'>" +

		"</div>" +
		"<div class='form-group'>" +
		"<label for='Entreprise'>Empresa/Organismo:</label>" +
		"<input type='text' class='form-control' id='Entreprise'>" +
		"</div>" +
		"<div class='row'>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de inicio:</label>" +
		"<input type='date' class='form-control' id='startDate'>" +
		"</div>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha fin:</label>" +
		"<input type='date' class='form-control' id='endDate'>" +
		"</div>" +
		"</div>" +
		"<div class='form-group'>" +
		"<label for='description'>Descripción:</label>" +
		"<textarea rows='4' cols='50' class='form-control' name='description'form='form-experience'></textarea>" +
		"</div>" +
		"<div id='addform'></div>"
"<form/>"
		;
}

//educacion
function addSection2() {
	document.getElementById("addform2").innerHTML +=
	"<form action=''method='' id='form-education'>"+
		"<div class='form-group'>" +
		"<label for='title2'>Titulo:</label>" +
		"<input type='text' class='form-control' id='title-education'>" +

		"</div>" +
		"<div class='form-group'>" +
		"<label for='Entreprise'>Universidad:</label>" +
		"<input type='text' class='form-control' id='university'>" +
		"</div>" +
		"<div class='row'>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de inicio:</label>" +
		"<input type='date' class='form-control' id='startDate'>" +
		"</div>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha fin:</label>" +
		"<input type='date' class='form-control' id='endDate'>" +
		"</div>" +
		"</div>" +
		"<div class='form-group'>" +
		"<label for='description'>Descripción:</label>" +
		"<textarea rows='4' cols='50' class='form-control' name='description'form='form-education'></textarea>" +
		"</div>" +
		"<div id='addform'></div>"
		"<form/>"

		;
}
//idiomas
function addSection3() {
	document.getElementById("addform3").innerHTML +=
	"<form action=''method='' id=''>"+
		"	<div class='row'>" +
		"<div class='col'>" +
		"<label for='languaje'>Idioma:</label>" +
		"<input type='text' class='form-control' id='languaje'>" +
		"</div>" +
		"<div class='col'>" +
		"<label for='nivel'>Nivel:</label>" +
		"<select class='form-select noMargin' aria-label='Default select example' name='nivel'>" +
		"<option selected>Nivel</option>" +
		"<option value='avanzado'>Avanzado</option>" +
		"<option value='intermedio'>Intermedio</option>" +
		"<option value='medio'>Intermedio</option>" +

		"</select>" +
		"</div>" +


		"</div>" +
		"<div class='form-group'>" +
		"<label for='type'>Tipo de certificación:</label>" +
		"<input type='text' class='form-control' id='type'>" +
		"</div>" +
		"<div class='row'>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de expedición:</label>" +
		"<input type='date' class='form-control' id='startDate'>" +
		"</div>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de caducidad:</label>" +
		"<input type='date' class='form-control' id='endDate'>" +

		"</div>" +
		"</div>"+"<form/>"

		;
}


//certificaciones
function addSection4() {
	document.getElementById("addform4").innerHTML +=
	"<form action=''method='' id='form-certifications'>"+
		"<div class='form-group'>" +
		"<label for='title2'>Titulo:</label>" +
		"<input type='text' class='form-control' id='title-certification'>" +

		"</div>" +
		"<div class='form-group'>" +
		"<label for='Entreprise'>Empresa/Organismo:</label>" +
		"<input type='text' class='form-control' id='Entreprise'>" +
		"</div>" +
		"<div class='row'>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de expedicion:</label>" +
		"<input type='date' class='form-control' id='startDate'>" +
		"</div>" +
		"<div class='col'>" +
		"<label for='startDate'>Fecha de caducidad:</label>" +
		"<input type='date' class='form-control' id='endDate'>" +
		"</div>" +
		"</div>" +
		"<div class='form-group'>" +
		"<label for='description'>Descripción:</label>" +
		"<textarea rows='4' cols='50' class='form-control' name='description'form='form-certifications'></textarea>" +
		"</div>" +
		"<div id='addform'></div>"+
		"<form/>"

		;
}

//generar pdf
  //funciona 2-3
   function pdfgenerate(){
	
        let doc = new jsPDF()
let sectionname = document.querySelector('#section-name')
let sectionexperience = document.querySelector('#section-experience')
doc.fromHTML(sectionname,15,15)
doc.fromHTML(sectionexperience,15,15)

doc.save("output.pdf")
    



// Save the PDF
doc.save('cv.pdf');

 
}
//wizard formluario
var currentTab = 0; // Current tab is set to be the first tab (0)
showTab(currentTab); // Display the current tab

function showTab(n) {
  // This function will display the specified tab of the form...
  var x = document.getElementsByClassName("col2");
  x[n].style.display = "block";
  //... and fix the Previous/Next buttons:
  if (n == 0) {
    document.getElementById("prevBtn").style.display = "none";
  } else {
    document.getElementById("prevBtn").style.display = "inline";
  }
  if (n == (x.length - 1)) {
    document.getElementById("nextBtn").innerHTML = "Crear Cuenta";
  } else {
    document.getElementById("nextBtn").innerHTML = "Siguiente";
  }
  //... and run a function that will display the correct step indicator:
  fixStepIndicator(n)
}

function nextPrev(n) {
  // This function will figure out which tab to display
  var x = document.getElementsByClassName("col2");
  // Exit the function if any field in the current tab is invalid:
  if (n == 1 && !validateForm()) return false;
  // Hide the current tab:
  x[currentTab].style.display = "none";
  // Increase or decrease the current tab by 1:
  currentTab = currentTab + n;
  // if you have reached the end of the form...
  if (currentTab >= x.length) {
    // ... the form gets submitted:
    document.getElementById("formCandidato").submit();
    return false;
  }
  // Otherwise, display the correct tab:
  showTab(currentTab);
}

function validateForm() {
  // This function deals with validation of the form fields
  var x, y, i, valid = true;
  x = document.getElementsByClassName("col2");
  y = x[currentTab].getElementsByTagName("input");
  // A loop that checks every input field in the current tab:
  for (i = 0; i < y.length; i++) {
    // If a field is empty...
    if (y[i].value == "") {
      // add an "invalid" class to the field:
      y[i].className += " invalid";
      // and set the current valid status to false
      valid = false;
    }
  }
  // If the valid status is true, mark the step as finished and valid:
  if (valid) {
    document.getElementsByClassName("step")[currentTab].className += " finish";
  }
  return valid; // return the valid status
}

function fixStepIndicator(n) {
  // This function removes the "active" class of all steps...
  var i, x = document.getElementsByClassName("step");
  for (i = 0; i < x.length; i++) {
    x[i].className = x[i].className.replace(" active", "");
  }
  //... and adds the "active" class on the current step:
  x[n].className += " active";
}