SELECT
  u.full_name,
  e.title AS event_name,
  f.rating,
  f.comments
FROM feedback f
JOIN users u ON u.user_id = f.user_id
JOIN events e ON e.event_id = f.event_id
WHERE f.rating < 3
ORDER BY f.rating, u.full_name;
