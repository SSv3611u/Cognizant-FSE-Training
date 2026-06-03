SELECT
  e.event_id,
  e.title
FROM events e
LEFT JOIN sessions s ON s.event_id = e.event_id
WHERE s.session_id IS NULL
ORDER BY e.title;
