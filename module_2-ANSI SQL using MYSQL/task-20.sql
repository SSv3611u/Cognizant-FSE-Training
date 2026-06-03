SELECT
  u.user_id,
  u.full_name,
  COUNT(DISTINCT r.event_id) AS events_attended,
  COUNT(DISTINCT f.feedback_id) AS feedback_submitted
FROM users u
LEFT JOIN registrations r ON r.user_id = u.user_id
LEFT JOIN feedback f ON f.user_id = u.user_id
GROUP BY u.user_id, u.full_name
ORDER BY u.full_name;
