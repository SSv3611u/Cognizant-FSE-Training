SELECT
  e.event_id,
  e.title,
  COUNT(DISTINCT r.registration_id) AS total_registrations,
  AVG(f.rating) AS average_rating
FROM events e
LEFT JOIN registrations r ON r.event_id = e.event_id
LEFT JOIN feedback f ON f.event_id = e.event_id
WHERE e.status = 'completed'
GROUP BY e.event_id, e.title
ORDER BY e.title;
