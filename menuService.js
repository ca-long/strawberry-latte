import { getDistance } from "./util";

export async function fetchCafesByMenu(menuName) {
    try {
        if (!menuName || menuName.trim() === "") return [];

        const response = await fetch(`http://localhost:8080/api/menu/search?name=${encodeURIComponent(menuName)}`);

        if (!response.ok) {
            throw new Error("Search failed on server.");
        }

        return await response.json();
    }
    catch (error) {
        console.error("Fetch Error: ", error);
        return [];
    }
}

export function sortByDistance(list, curPos) {
    return [...list].sort((a, b) => {
        const distA = getDistance(curPos, a);
        const distB = getDistance(curPos, b);

        return distA - distB;
    })
}

export function sortByPrice(list) {
    return [...list].sort((a, b) => a.price - b.price);
}

export function sortByRating(list) {
    return [...list].sort((a, b) => b.rating - a.rating);
}

export function sortByReviewCount(list) {
    return [...list].sort((a, b) => b.reviewCount - a.reviewCount);
}