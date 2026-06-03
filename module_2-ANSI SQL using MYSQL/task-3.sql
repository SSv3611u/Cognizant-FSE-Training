SELECT
  u.user_id,
  u.full_name,
  u.email,
  u.city
FROM users u
WHERE NOT EXISTS (
  SELECT 1
  FROM registrations r
  WHERE r.user_id = u.user_id
    AND r.registration_date >= CURRENT_DATE - INTERVAL 90 DAY
);
