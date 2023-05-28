async function postData(data) {
  try {
    // Realizar la solicitud POST
    const response = await fetch('localhost:8001/api-cultivo/save', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(data)
    });

    if (response.ok) {
      // La solicitud se realizó correctamente
      console.log('Datos enviados exitosamente');
    } else {
      // La solicitud falló
      console.error('Error al enviar los datos');
    }
  } catch (error) {
    // Manejo de errores
    console.error('Error en la solicitud:', error);
  }
}

// Obtener referencias a los campos de entrada en el formulario
const nombreInput = document.getElementById('nombre');
const direccionInput = document.getElementById('direccion');
const telefonoInput = document.getElementById('telefono');

// Agregar un evento de escucha al formulario cuando se envíe
const form = document.getElementById('myForm');
form.addEventListener('submit', function (event) {
  event.preventDefault(); // Evitar que el formulario se envíe automáticamente

  // Obtener los valores de los campos de entrada
  const nombre = nombreInput.value.trim();
  const direccion = direccionInput.value.trim();
  const telefono = telefonoInput.value.trim();

  // Validar los campos
  if (nombre === '' || direccion === '' || telefono === '') {
    alert('Por favor, complete todos los campos');
    return;
  }

  // Crear el objeto de datos a enviar
  const data = {
    nombre,
    direccion,
    telefono
  };



  // Realizar la solicitud POST
  postData(data);
});

// Formulario Cultivo

document.getElementById('registroForm').addEventListener('submit', function (event) {
  event.preventDefault();

  // Obtener los valores de los campos de entrada
  const distrito = document.getElementById('distrito').value;
  const fecha = document.getElementById('fecha').value;
  const hectareas = document.getElementById('hectareas').value;
  const litros = document.getElementById('litros').value;
  const cultivo = document.getElementById('cultivo').value;

  // Validar los campos
  if (!distrito || !fecha || !hectareas || !litros || !cultivo) {
    alert('Por favor, complete todos los campos');
    return;
  }

  // Crear el objeto de datos a enviar
  const data = {
    distrito,
    fecha,
    hectareas,
    litros,
    cultivo
  };

  // Realizar la solicitud POST
  const xhr = new XMLHttpRequest();
  xhr.open('POST', 'https://api.example.com/submit', true);
  xhr.setRequestHeader('Content-Type', 'application/json');

  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        console.log('Datos enviados exitosamente');
      } else {
        console.error('Error al enviar los datos');
      }
    }
  };

  xhr.onerror = function () {
    console.error('Error en la solicitud');
  };

  xhr.send(JSON.stringify(data));
});
