SELECT
  e.city,
  COUNT(DISTINCT r.user_id) AS registered_users
FROM events e
JOIN registrations r ON r.event_id = e.event_id
GROUP BY e.city
ORDER BY registered_users DESC, e.city
LIMIT 5;
