// Simula una petición que tarda 5 segundos
function simulateRequest() {
    return new Promise((resolve) => {
        setTimeout(resolve, 5000);
    });
}

// Muestra el overlay de carga y anima el progreso
function showLoadingOverlay() {
    const overlay = document.getElementById('loading-overlay');
    overlay.style.visibility = 'visible';
    overlay.style.opacity = '1';

    const progressBar = document.getElementById('progress-bar');
    progressBar.style.width = '0';

    const animationDuration = 5000; // Duración de la animación en milisegundos

    // Actualiza el progreso cada 100ms
    const intervalId = setInterval(() => {
        const currentWidth = parseInt(progressBar.style.width, 10);
        const increment = (100 / animationDuration) * 100;
        const newWidth = currentWidth + increment;
        progressBar.style.width = `${newWidth}%`;

        if (newWidth >= 100) {
            clearInterval(intervalId);
        }
    }, 100);
}

// Oculta el overlay de carga
function hideLoadingOverlay() {
    const overlay = document.getElementById('loading-overlay');
    overlay.style.visibility = 'hidden';
    overlay.style.opacity = '0';
}

// Simula una petición y muestra/oculta el overlay
function makeRequest() {
    showLoadingOverlay();

    simulateRequest()
        .then(() => {
            // Petición completada
            hideLoadingOverlay();
        })
        .catch(() => {
            // Error en la petición
            hideLoadingOverlay();
        });
}

// Ejecutar la función makeRequest() cuando sea necesario
makeRequest();
