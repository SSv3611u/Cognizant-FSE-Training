SELECT
  registration_date,
  COUNT(user_id) AS new_user_count
FROM users
WHERE registration_date >= CURRENT_DATE - INTERVAL 7 DAY
GROUP BY registration_date
ORDER BY registration_date;
