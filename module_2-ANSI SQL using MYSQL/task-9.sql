SELECT
  u.user_id AS organizer_id,
  u.full_name AS organizer_name,
  e.status,
  COUNT(e.event_id) AS event_count
FROM users u
JOIN events e ON e.organizer_id = u.user_id
GROUP BY u.user_id, u.full_name, e.status
ORDER BY u.full_name, e.status;
