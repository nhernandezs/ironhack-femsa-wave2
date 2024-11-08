// ïndice en status
// O podrías considerar un índice compuesto { status: 1, location: 1 }.
// Usar un sharded cluster, asegúrate de que el shard key está optimizado y, si es posible, alineado de forma que tus operaciones de agregado no requieran mover muchos datos entre shards.
db.users.aggregate([
  { $match: { status: "active" } },
  { $group: { _id: "$location", totalUsers: { $sum: 1 } } },
]);
