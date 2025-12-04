SELECT author_id AS id FROM Views
WHERE author_id = viewer_id
group by author_id
ORDER BY author_id ASC;