import { useMutation, useQueryClient } from '@tanstack/react-query';
import React from 'react';

export const updateTask = async (text: string) => {
    const res = await fetch('http://localhost:8000/cities', {
        method: 'POST',
        headers: {
            'content-type': 'application/json',
        },
        body: JSON.stringify({
            text: text,
        }),
    });
    const data = await res.json();
    return data;
};

export const updateCode = async () => {
    const res = await fetch('http://localhost:8000/cities');
    const data = await res.json();
    return data;
};

export function UpdateTask(city: any) {
    const queryClient = useQueryClient();

    const { isLoading, mutate } = useMutation({
        mutationFn: updateTask,
        onSuccess: () => {
            console.log('Update Success!');
            queryClient.invalidateQueries({
                queryKey: ['cityName'],
            });
        },
        onError: (err: any) => console.log(err.message),
    });
}

export function UpdateCode(code: string[]) {
    const queryClient = useQueryClient();

    const { isLoading, mutate } = useMutation({
        mutationFn: updateCode,
        onSuccess: () => {
            console.log('Update Success!');
            queryClient.invalidateQueries({
                // 일단 비워둠
            });
        },
    });
}
