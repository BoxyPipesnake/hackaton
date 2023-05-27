document.getElementById("datosPersonalesForm").addEventListener("submit", function (event) {
  event.preventDefault();
  document.getElementById("datosPersonalesForm").classList.add("inactive");
  document.getElementById("form").classList.remove("inactive");
});

document.getElementById("form").addEventListener("submit", function (event) {
  event.preventDefault();

  // Obtener los valores del primer formulario
  const nombre = document.getElementById("nombre").value;
  const apellido = document.getElementById("apellido").value;
  const telefono = document.getElementById("telefono").value;
  const direccion = document.getElementById("direccion").value;
  const fecha = document.getElementById("fecha").value;
  const estado = document.getElementById("estado").value;
  const ciclo = document.getElementById("ciclo").value;

  // Obtener los valores del segundo formulario
  const distrito = document.getElementById("distrito").value;
  const municipio = document.getElementById("municipio").value;
  const hectareas = document.getElementById("hectareas").value;
  const mes = document.getElementById("mes").value;
  const ano = document.getElementById("ano").value;
  const tipocultivo = document.getElementById("tipocultivo").value;

  // Crear un objeto con los datos combinados
  const datosCombinados = {
    nombre,
    apellido,
    telefono,
    direccion,
    fecha,
    estado,
    ciclo,
    distrito,
    municipio,
    hectareas,
    mes,
    ano,
    tipocultivo,
  };

  // Enviar los datos al backend usando Ajax
  const xhr = new XMLHttpRequest();
  xhr.open("POST", "URL_DEL_BACKEND"); // Reemplaza "URL_DEL_BACKEND" por la URL de tu backend
  xhr.setRequestHeader("Content-Type", "application/json");
  xhr.onload = function () {
    if (xhr.status === 200) {
      console.log("Datos enviados exitosamente");
      // Aquí puedes agregar el código para mostrar un mensaje de éxito al usuario
    } else {
      console.error("Error al enviar los datos");
      // Aquí puedes agregar el código para mostrar un mensaje de error al usuario
    }
  };
  xhr.send(JSON.stringify(datosCombinados));
});



  // const datos = {
    //   "telefono": "1234567890",
    //   "direccion": "Calle Principal",
    //   "cultivo": {
      //       "fecha": fechaValue,
      //       "en_federativa": enFederativaValue,
      //       "ciclo": cicloValue,
      //       "municipio": municipioValue,
      //       "hectareas": hectareasValue,
      //       "mes": mesValue,
      //       "año": añoValue,
      //       "tipocultivo": tipoCultivoValue,
//       "usuario": usuarioValue,
//       "distrito": distritoValue
//   }
// }

// const api = '';


    // $.ajax({
    //     type: 'POST',
    //     url: 'http://localhost:8001/service-usuario/save',
    //     data: JSON.stringify(datos),
    //     contentType: 'application/json',
    //     success: function(response) {
    //       console.log('Usuario guardado exitosamente:', response);
    //       alert('Usuario guardado exitosamente');
    //     },
    //     error: function(error) {
    //       console.log('Error al guardar el usuario:', error);
    //       alert('Error al guardar el usuario');
    //     }
    //   });
