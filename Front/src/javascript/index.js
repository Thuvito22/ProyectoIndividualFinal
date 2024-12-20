$(function() {
  // Evento para el botón de listar productos
  $('#listar-productos').on('click', function() {
      fetchProductos();
  });
});

// Función para obtener productos y mostrarlos
function fetchProductos() {
  $.get('http://localhost:1234/api/productos', function(productos) {
      displayProductos(productos);
  }).fail(function() {
      alert('Error al obtener productos');
  });
}



// Función para mostrar los productos en la lista
function displayProductos(productos) {
  const list = $('#productos-list');
  list.empty();
  productos.forEach(producto => {
      const item = $('<li>').text(`${producto.nombre} - ${producto.descripcion} - ${producto.precio}€`);
      list.append(item);
  });




  
}





