# HomeMaintenanceTracker

Asset — объект учёта (дом, машина, станция очистки, баня и т.п.)
MaintenanceTask — задача обслуживания (замена фильтра, ТО машины, чистка септика)
Consumable — расходник (фильтр, масло, батарейки)
LogEntry — запись о выполненной работе

GET  /assets
POST /assets
GET  /assets/{id}
PUT  /assets/{id}
DELETE /assets/{id}

GET  /maintenance-tasks
POST /maintenance-tasks