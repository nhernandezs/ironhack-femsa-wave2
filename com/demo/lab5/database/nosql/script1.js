// Índice en status y en likes
// Uso de .limit(n)
// Se puede agregar el pipeline de agregación $sum o guardar el total de likes.
db.posts
  .find({ status: "active" }, { title: 1, likes: 1 })
  .sort({ likes: -1 });


