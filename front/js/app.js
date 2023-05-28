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
