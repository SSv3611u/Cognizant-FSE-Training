SELECT
  e.event_id,
  e.title,
  COUNT(s.session_id) AS session_count
FROM events e
LEFT JOIN sessions s ON s.event_id = e.event_id
WHERE e.status = 'upcoming'
GROUP BY e.event_id, e.title
ORDER BY e.start_date;
