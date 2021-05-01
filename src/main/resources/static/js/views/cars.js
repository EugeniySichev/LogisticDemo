define(function() {
    return {
        rows: [
            {
                view: 'button',
                label: 'Main',
                click: function() {
                    routie('')
                }
            },
            {
                view: 'list',
                data: [
                    'test1',
                    'test2',
                    'test3'
                ]
            }
        ]
    }
})
