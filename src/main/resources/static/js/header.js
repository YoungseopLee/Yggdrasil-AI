document.querySelector('a[href="/logout"]').addEventListener('click', function(e) {
    e.preventDefault();

    fetch('/logout', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => {
        if (response.ok) {
            location.reload();
        } else {
            console.error('Logout failed');
        }
    })
    .catch(error => console.error('Error:', error));
});