SELECT
  u.user_id,
  u.full_name,
  u.email,
  u.registration_date
FROM users u
LEFT JOIN registrations r ON r.user_id = u.user_id
WHERE u.registration_date >= CURRENT_DATE - INTERVAL 30 DAY
  AND r.registration_id IS NULL
ORDER BY u.registration_date DESC;
